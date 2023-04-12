public class XMLHandler extends AbstractHandler
{

@Override
    public void definition()
{
    System.out.println("Документ формату XML");
}
    public void open()
    {
        System.out.println("Документ формату XML можна відкрити за допомогою текстового файла");
    }

    public void create()
    {
        System.out.println("Документ формату XML створюється методом присвоєння розширення .xml");
    }

    public void change()
    {
        System.out.println("Документ формату XML можна змінити за допомогою спеціальної програми, або в текстовому документі");
    }

    public void save()
    {
        System.out.println("Документ формату XML зберігається натисканням книоки - Зберігти");
    }

}
