package creational.builder;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class MongoDbQuery implements Query{
    private String from = "";

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    private String where;


    @Override
    public void execute() {
        System.out.println("Executing MongoDB from: "+from+" where "+where);
    }
}
