package service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    private static final int start = 1;
    private static final int end = 100000000;
    private static final int target = 99999997;
    List<Integer> searchVector = new ArrayList<>();

    public SearchServiceImpl() {
        for (int i = start; i <= end; i++)
            searchVector.add(i);
    }

    @Override
    public void sequentialSearch() {
        searchVector.indexOf(target);
    }

    @Override
    public void binarySearch() {
        Collections.binarySearch(searchVector, target);
    }
}
