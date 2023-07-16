import java.util.List;

public class QuerySelectTest {

    public static void main(String[] args) {
        DatabaseQueryService queryService = new DatabaseQueryService();

        List<MaxProjectCountClient> maxProjectCountClients = queryService.findMaxProjectsClient();
        System.out.println("Find MaxProjectCountClient: " + maxProjectCountClients);

        List<FindLongestProject> FindLongestProject = queryService.findFindLongestProject();
        System.out.println("Find FindLongestProject: " + FindLongestProject);

        List<MaxSalaryWorker> findMaxSalaryWorker = queryService.findMaxSalaryWorker();
        System.out.println("Find MaxSalaryWorker: " + findMaxSalaryWorker);

        List<YoungestEldestWorkers> findYoungestEldestWorkers = queryService.findYoungestEldestWorkers();
        System.out.println("Find YoungestEldestWorkers: " + findYoungestEldestWorkers);

    }

}
