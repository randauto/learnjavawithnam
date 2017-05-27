package creational.builder.improved;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class QueryBuildDirection {
    public Query buildQuery(String from, String where, QueryBuilder builder) {
        builder.setFrom(from);
        builder.setWhere(where);

        return builder.getQuery();
    }
}
