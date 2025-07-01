abstract class Automation {
    abstract void execute();
}

class EmailSender extends Automation {
    void execute() {
        System.out.println("Sending emails...");
    }
}

class FileArchiver extends Automation  {
    void execute() {
        System.out.println("Archiving files...");
    }
}

class DatabaseBackup extends Automation {
    void execute() {
        System.out.println("Backing up database...");
    }
}

public class Code_8 {
    public static void main(String[] args) {
        Automation  email = new EmailSender();
        Automation archive = new FileArchiver();
        Automation backup = new DatabaseBackup();

        email.execute();
        archive.execute();
        backup.execute();
    }
}

