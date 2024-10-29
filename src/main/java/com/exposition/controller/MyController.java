package com.exposition.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exposition.bridge.IViewModel;
import com.exposition.bridge.JustTextListItemView;
import com.exposition.bridge.ListViewItem;
import com.exposition.bridge.StreamViewModel;
import com.exposition.bridge.VideoViewModel;
import com.exposition.bridge.WithTumbnailListItemView;

@RestController
@RequestMapping("/content")
public class MyController {

    List<IViewModel> contentList = new ArrayList<>();
    List<ListViewItem> listViewItems = new ArrayList<>();

    @GetMapping("/bridge")
    public String BridgeGetController() {
        String response = "";
        contentList.add(new VideoViewModel("123", "video", "Playing GTA with suscribers", "image1", "https://www.youtube.com/watch?v=6bIHhzqMdgg", "1:32", "2023-10-28 14:30:00"
        ));
        contentList.add(new StreamViewModel("124", "stream", "Just chatting", "image2", "https://www.youtube.com/watch?v=07YtBj3BEBQ", "ON ", 45, "2023-10-28 14:30:00", "4:56"));

        for (var item : contentList) {
            System.out.println("RANDOM: ");
            System.out.println(Math.random());
            var randomValue = Math.random() >= 0.3;

            if (randomValue) {
                listViewItems.add(new WithTumbnailListItemView(item));
            } else {
                listViewItems.add(new JustTextListItemView(item));
            }
        }

        for (var itemView : listViewItems) {
            response = response + '\'' + itemView.render();
        }

        return response;
    }
}
