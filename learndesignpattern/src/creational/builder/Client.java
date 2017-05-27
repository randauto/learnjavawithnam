package creational.builder;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class Client {
    public static void main(String[] args) {
        SqlQuery sqlQuery = new SqlQuery();
        sqlQuery.setFrom("Ha noi");
        sqlQuery.setWhere("District");
        sqlQuery.execute();
    }

}
