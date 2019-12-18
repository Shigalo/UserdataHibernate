package by.bsuir.userhibernate;

import by.bsuir.userhibernate.dao.UserdataDaoImpl;
import by.bsuir.userhibernate.entity.Citizenship;
import by.bsuir.userhibernate.entity.City;
import by.bsuir.userhibernate.entity.User;
import by.bsuir.userhibernate.entity.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {

    public static void main(final String[] args) throws Exception {
        List<User> usersList = null;
        try {
            JAXBContext jc = JAXBContext.newInstance("by.bsuir.userhibernate.entity");
            Unmarshaller um = jc.createUnmarshaller();
            Users users = (Users) um.unmarshal(new File("userdata.xsd.xml"));
            usersList = users.getUser();
        } catch (JAXBException e) {
            System.err.println(e.toString());
        }

        UserdataDaoImpl userdataDao = UserdataDaoImpl.getInstance();
        User u = new User("Name1", "SecoundName2", "LastName2", "0000",
                new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001"),
                true, "MC", "1111111",
                "1111111111111", "Give2",
                new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001"),
                City.MINSK, "2Address", "1112223", "newmail@mail.ru",
                Citizenship.LITHUANIAN, 1);
        userdataDao.create(u);

        for (User user : usersList) {
            //System.out.println(user);
            userdataDao.update(user);
        }

        List<User> foundUser = userdataDao.findAll();
        for (User user : foundUser) { System.out.println(user); }

        userdataDao.delete(u);

        JAXBContext context = JAXBContext.newInstance(Users.class);
        Marshaller m = context.createMarshaller();
        Users users = new Users();

        users.setUser(foundUser);
        m.marshal(users, new FileOutputStream("users_marsh.xml"));
    }
}