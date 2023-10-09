package seedu.duke;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        Input input = new Input();
        String logo = "    ______           __    __         __  ___  \n"
                    + "   / ____/___ ______/ /_  / /   ___  / /_/__ \\ \n"
                    + "  / /   / __ `/ ___/ __ \\/ /   / _ \\/ __ \\/ _/ \n"
                    + " / /___/ /_/ (__  ) / / / /___/  __/ / / /_/   \n"
                    + " \\____/\\__,_/____/_/ /_/_____/\\___/_/ /_(_)    \n";
        System.out.println(logo);
        System.out.println("Welcome to 'CashLeh?'! Your one-stop app for managing your finances!");
        System.out.println("Here is the link to the user guide:"
                + "https://docs.google.com/document/d/15h45BB5kMkTZ6bkwUHujpYwxVVl80tNEyNUsEVyk5AQ/edit?usp=drive_link");

        String inputString;
        do {
            inputString = input.getInputString();
            if (inputString.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
            } else {
                System.out.println("Sorry, I don't understand what you mean.");
            } 
        } while (!inputString.equals("bye"));
        
    }
}
