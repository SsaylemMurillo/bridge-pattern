// MyController.java
package com.exposition.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exposition.bridge.CompactViewMetadata;
import com.exposition.bridge.ExtendedViewMetadata;
import com.exposition.bridge.FeedItemMetadata;
import com.exposition.bridge.IViewModel;
import com.exposition.bridge.Metadata;
import com.exposition.bridge.StreamViewModel;
import com.exposition.bridge.VideoViewModel;

@RestController
@RequestMapping("/content")
public class MyController {

    List<IViewModel> contentList;
    List<FeedItemMetadata> listViewItems;

    @GetMapping("/metadata")
    public List<Metadata> getContentMetadata() {
        contentList = new ArrayList<>();
        listViewItems = new ArrayList<>();
        List<Metadata> response = new ArrayList<>();

        contentList.add(new VideoViewModel("123", "video", "Playing GTA with subscribers", "image1",
                "https://www.youtube.com/watch?v=6bIHhzqMdgg", "1:32", "2023-10-28 14:30:00"));
        contentList.add(new StreamViewModel("124", "stream", "Just chatting", "image2",
                "https://www.youtube.com/watch?v=07YtBj3BEBQ", "ON", 45, "2023-10-28 14:30:00", "4:56"));
        contentList.add(new VideoViewModel("125", "video", "Way to Radiant - Horcus", "image3",
                "https://www.youtube.com/watch?v=6bIHhzqMdgg", "2:32", "2023-10-28 14:30:00"));
        contentList.add(new VideoViewModel("126", "video", "Heavy Is The Crown - Linkin Park ft. League Of Legends", "image4",
                "https://www.youtube.com/watch?v=6bIHhzqMdgg", "4:20", "2023-10-28 14:30:00"));
        for (var item : contentList) {
            var randomValue = Math.random() >= 0.2;

            if (randomValue) {
                listViewItems.add(new ExtendedViewMetadata(item));
            } else {
                listViewItems.add(new CompactViewMetadata(item));
            }
        }

        for (var itemView : listViewItems) {
            response.add(itemView.retrieveMetadata());
        }

        return response;
    }
}
