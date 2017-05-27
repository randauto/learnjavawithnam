package creational.builder.improved;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class SqlQueryBuilder implements QueryBuilder {
    private SqlQuery query = new SqlQuery();

    @Override
    public void setFrom(String from) {
        query.setFrom(from);
    }

    @Override
    public void setWhere(String where) {
        query.setWhere(where);
    }

    @Override
    public Query getQuery() {
        return query;
    }
}
