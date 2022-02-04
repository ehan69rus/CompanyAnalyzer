package Items;

// Компания
public class CompanyItem {
    //! Идентификатор
    long id;
    //! Наименование
    String name;
    // Данные
    DataItem data;

    public CompanyItem(long id, String name, DataItem data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataItem getData() {
        return data;
    }

    public void setData(DataItem data) {
        this.data = data;
    }
}
