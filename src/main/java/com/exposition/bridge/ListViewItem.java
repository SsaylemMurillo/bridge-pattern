package com.exposition.bridge;

public abstract class ListViewItem {

    private IViewModel viewModel;

    public ListViewItem(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public IViewModel getViewModel() {
        return viewModel;
    }

    public void setViewModel(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public abstract String render();
}
