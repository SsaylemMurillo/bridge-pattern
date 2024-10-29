package com.exposition.bridge;

public class CompactViewMetadata extends FeedItemMetadata {

    public CompactViewMetadata(IViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public Metadata retrieveMetadata() {
        return new Metadata(getViewModel().getTitle(), null);
    }
}

