// ExtendedViewMetadata.java (antes WithTumbnailListItemView)
package com.exposition.bridge;

public class ExtendedViewMetadata extends FeedItemMetadata {

    public ExtendedViewMetadata(IViewModel viewModel) {
        super(viewModel);
    }

    @Override
    public Metadata retrieveMetadata() {
        return new Metadata(getViewModel().getTitle(), getViewModel().getMiniature());
    }
}
