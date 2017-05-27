package creational.builder.improved;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class Client {
    public static void main(String[] args) {
        QueryBuildDirection queryBuildDirection = new QueryBuildDirection();
        String from = "Sql";
        String where = "Sql table";

        QueryBuilder queryBuilder = new SqlQueryBuilder();

        Query query = queryBuildDirection.buildQuery(from, where, queryBuilder);
        query.execute();

        queryBuilder = new MongoDbQueryBuilder();
        query = queryBuildDirection.buildQuery(from, where, queryBuilder);
        query.execute();

    }
}
