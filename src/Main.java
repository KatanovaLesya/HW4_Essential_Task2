public class Main {

    public static void main(String[] args) {

        DOCHandler docHandler = new DOCHandler();
        TXTHandler txtHandler = new TXTHandler();
        XMLHandler xmlHandler = new XMLHandler();

        docHandler.file();

        docHandler.definition();
        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();

        txtHandler.definition();
        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();

        xmlHandler.definition();
        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();



    }
}
