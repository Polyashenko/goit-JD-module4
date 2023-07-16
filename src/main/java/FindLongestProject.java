public class FindLongestProject {
    private final int id;
    private final int duration;

    public int getName() {
        return id;
    }

    public int getDateCount() {
        return duration;
    }

    public FindLongestProject(int name, int dateCount) {
        this.id = name;
        this.duration = dateCount;
    }

    @Override
    public String toString() {
        return "FindLongestProject{" +
                "name='" + id + '\'' +
                ", dateCount=" + duration +
                '}';
    }
}
