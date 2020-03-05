package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.SearchService;

@Controller
public class SearchController {
    private SearchService searchService;

    @Autowired
    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }

    // 순차 탐색
    @RequestMapping(value = "/search/sequential", method = RequestMethod.GET)
    public String getSequentialSearch() {
        searchService.sequentialSearch();
        return "home";
    }

    // 이진 탐색
    @RequestMapping(value = "/search/binary", method = RequestMethod.GET)
    public String getBinarySearch() {
        searchService.binarySearch();
        return "home";
    }
}
