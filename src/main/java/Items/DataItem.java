package Items;

import java.util.Date;

// Данные
public class DataItem {
    // Тип данных
    private enum Type {
        Fact,       // По факту
        Forecast    // По прогнозу
    }

    // Дата
    private Date date;
    // Значение Qliq
    private int qliqValue;
    // Значение Qoil
    private int qoilValue;
    // Тип данных
    private DataItem.Type type;

    public DataItem(Date date, int qliqValue, int qoilValue, Type type) {
        this.date = date;
        this.qliqValue = qliqValue;
        this.qoilValue = qoilValue;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQliqValue() {
        return qliqValue;
    }

    public void setQliqValue(int qliqValue) {
        this.qliqValue = qliqValue;
    }

    public int getQoilValue() {
        return qoilValue;
    }

    public void setQoilValue(int qoilValue) {
        this.qoilValue = qoilValue;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
