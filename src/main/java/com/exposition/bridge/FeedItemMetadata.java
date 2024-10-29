// FeedItemMetadata.java (antes ListViewItem)
package com.exposition.bridge;

public abstract class FeedItemMetadata {

    private IViewModel viewModel;

    public FeedItemMetadata(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public IViewModel getViewModel() {
        return viewModel;
    }

    public void setViewModel(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public abstract Metadata retrieveMetadata();
}
