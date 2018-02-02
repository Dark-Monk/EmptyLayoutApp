# Empty Layout

A library to show Empty layouts no the pages where you want show some collection but the collection does not contain any items.

:star:  `build support version used : 26.0.2 `

:star:  `Data Binding is not used`

# Usage Examples

*       new EmptyFragment()
                        .setImageDrawableId(R.drawable.my_image)
                        .setTitleText("Your Cart Is Empty")
                        .setContentText("Add some product to your cart and view them here")
                        .setButtonText("Continue Shopping")
                        .setButtonOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getSupportFragmentManager().popBackStack();
                            }
                        })
                        .show(this);
                        
*       new EmptyFragment()
                                .setImageDrawableId(R.drawable.my_image)
                                .setTitleText("Your Cart Is Empty")
                                .setContentText("Add some product to your cart and view them here")
                                .setButtonText("Continue Shopping")
                                .setButtonOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        getSupportFragmentManager().popBackStack();
                                    }
                                })
                                .show(this, R.id.your_view);
