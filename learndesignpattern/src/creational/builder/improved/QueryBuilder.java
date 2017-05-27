package creational.builder.improved;

/**
 * Created by TuanLQ on 5/27/17.
 */
public interface QueryBuilder {
    void setFrom(String from);

    void setWhere(String where);

    Query getQuery();
}
