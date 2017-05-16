import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by dianmink on 09-05-2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //commandLoop-wait for userinput ,analyze,execute etc

        Notebook commands = new Notebook();
        Shell shell = ShellFactory.createConsoleShell("cmd", "My Notebook", commands);
        shell.commandLoop();

    }


}
