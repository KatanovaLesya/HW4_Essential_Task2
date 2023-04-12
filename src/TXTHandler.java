public class TXTHandler extends AbstractHandler

{
    @Override
    public void definition()
    {
        System.out.println("Документ формату TXT");
    }
    public void open()
    {
        System.out.println("Документ формату TXT можна відкрити програмою Microsoft Word");
    }

    public void create()
    {
        System.out.println("Документ формату TXT створюється методом присвоєння розширення .txt");
    }

    public void change()
    {
        System.out.println("Документ формату TXT можна змінити в текстовому документі");
    }

    public void save()
    {
        System.out.println("Документ формату TXT зберігається натисканням книоки - Зберігти");
    }
}
