package com.zephyraft.dp._1creation._4prototype._1recursion;


import com.zephyraft.dp._1creation._4prototype._help.SearchWord;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Demo {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        HashMap<String, SearchWord> newKeywords = deepCopy();

        // 从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                SearchWord oldSearchWord = newKeywords.get(searchWord.getKeyword());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            } else {
                newKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }

        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    // Deep copy
    private HashMap<String, SearchWord> deepCopy() {
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        for (HashMap.Entry<String, SearchWord> e : currentKeywords.entrySet()) {
            SearchWord searchWord = e.getValue();
            SearchWord newSearchWord = new SearchWord(searchWord.getKeyword(), searchWord.getCount(), searchWord.getLastUpdateTime());
            newKeywords.put(e.getKey(), newSearchWord);
        }
        return newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // 从数据库中取出更新时间>lastUpdateTime的数据
        return Collections.emptyList();
    }

}
