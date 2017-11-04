package id.co.ukabima.plugins;

public class PageCounter {

    private final Integer element;
    private final Integer limit;
    private final Integer offset;

    public PageCounter(Integer totalOfElements, Integer limit, Integer offset) {
        this.element = totalOfElements;
        this.limit = limit;
        this.offset = offset;
    }

    public Integer pageSize() {
        return element / limit;
    }

    private Integer elementSize() {
        return (element - offset) / limit;
    }

    public Integer currentPage() {
        return pageSize() - elementSize();
    }
}
