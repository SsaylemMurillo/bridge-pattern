package com.exposition.bridge;

public class JustTextListItemView extends ListViewItem {

    public JustTextListItemView(IViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public String render() {
        return "------------------------------------------" + '\''
                + "Rendering only text thumbnail " + '\'' + "Title {" + this.getViewModel().getTitle() + "}" + '\''
                + "------------------------------------------" + '\'';
    }
}
