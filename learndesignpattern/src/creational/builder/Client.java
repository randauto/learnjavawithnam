package creational.builder;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class Client {
    public static void main(String[] args) {
        SqlQuery sqlQuery = new SqlQuery();
        sqlQuery.setFrom("Ha noi");
        sqlQuery.setWhere("ID = 800");
        sqlQuery.execute();

        MongoDbQuery mongoDbQuery = new MongoDbQuery();
        mongoDbQuery.setFrom("HCM");
        mongoDbQuery.setWhere("ID = 1000");
        mongoDbQuery.execute();
    }

}
