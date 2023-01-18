package tests;
import org.junit.Assert;
import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Day09_FileExistTest {
    @Test
    public void isExistTest(){
        String userDIR= System.getProperty("user.dir");       //=>gives the path of the current project folder
        System.out.println(userDIR); ///Users/techproed/IdeaProjects/SeleniumNewProject
        String userHOME=System.getProperty("user.home");      //=>gives you the user folder
        System.out.println(userHOME); ///Users/techproed
//        Pick a file on your desktop
//        And verify if that file exist on your computer or not
        String pathOfFile = userHOME + "/Desktop/logo.jpeg";//WRITING THE PATH DYNAMICALLY SO THIS PATH CAN WORKS ON OTHER LAPTOPS
        boolean isExist = Files.exists(Paths.get(pathOfFile));//returns TRUE if file exists. FALSE if file doesn't exists
        Assert.assertTrue(isExist);

    }
    /*
    Class: FileExistTest
Method: isExist
Pick a file on your desktop
And verify if that file exist on your computer or not
     */
}
