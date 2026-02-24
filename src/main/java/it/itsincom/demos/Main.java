package it.itsincom.demos;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.codejargon.fluentjdbc.api.FluentJdbc;
import org.codejargon.fluentjdbc.api.query.Query;
import org.codejargon.fluentjdbc.api.query.SelectQuery;

import java.util.List;

@QuarkusMain
public class Main implements QuarkusApplication {

    private final FluentJdbc client;

    public Main(FluentJdbc client) {
        this.client = client;
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello World!");

        Query query = client.query();
        SelectQuery select = query.select("SELECT 1 as id");
        AulaMapper mapper = new AulaMapper();
        List<Aula> aulee = select.listResult(mapper);
        System.out.println("Aulee: " + aulee);
        return 0;
    }
}
