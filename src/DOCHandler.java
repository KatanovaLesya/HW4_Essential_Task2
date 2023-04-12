public class DOCHandler extends AbstractHandler

{
    @Override
    public void definition()
    {
        System.out.println("Документ формату DOC");
    }

    public void open()
    {
        System.out.println("Документ формату DOC можна відкрити програмою TextEditor");
    }

    public void create()
    {
        System.out.println("Документ формату DOC створюється методом присвоєння розширення .doc");
    }
    public void change()
    {
        System.out.println("Документ формату DOC можна змінити в текстовому документі");
    }

    public void save()
    {
        System.out.println("Документ формату DOC зберігається натисканням книоки - Зберігти");
    }
}
