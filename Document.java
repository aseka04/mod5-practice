package practice;

interface Document {
    void Open();
}
class Report implements Document{
    @Override
    public void Open() {
        System.out.println("Otchet opened");
    }
}
class Resume implements Document{
    @Override
    public void Open() {
        System.out.println("Resume opened");
    }
}

class Letter implements Document{
    @Override
    public void Open() {
        System.out.println("Resume opened");
    }
}

abstract class DocumentCreator{
    public abstract Document createDocument();

}
class ReportCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new Report();
    }
}

class ResumeCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new Resume();
    }
}

class LetterCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new Letter();
    }
}
class Main{
    public static void main(String[] args) {
        DocumentCreator documentCreator1 = new ReportCreator();
        DocumentCreator documentCreator2 = new ResumeCreator();
        DocumentCreator documentCreator3 = new LetterCreator();

        documentCreator1.createDocument();
        System.out.println("otchet created");
        documentCreator2.createDocument();
        System.out.println("resume created");
        documentCreator3.createDocument();
        System.out.println("letter created");
    }
}