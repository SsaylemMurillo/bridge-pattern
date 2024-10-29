package com.exposition.bridge;

public class WithTumbnailListItemView extends ListViewItem {

    public WithTumbnailListItemView(IViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public String render() {
        return "------------------------------------------" + '\''
                + "Rendering thumbnail " + '\'' + "Title {" + this.getViewModel().getTitle() + "}" + '\'' + "Miniature {" + this.getViewModel().getMiniature() + "}" + '\''
                + "------------------------------------------" + '\'';
    }

}
