public abstract class AbstractHandler {

    public void file()
    {
        System.out.println("Поговоримо про документи різного формату!");
        System.out.println();

    }

    public abstract void definition();

    public abstract void open();

    public abstract void create();

   public abstract void change();

    public abstract void save();

}


//У тілі класу створити методи void open(), void create(), void change(), void save().

//Написати програму, яка виконуватиме визначення документа і для кожного формату мають бути методи відкриття,
// створення, редагування, збереження певного формату документа.