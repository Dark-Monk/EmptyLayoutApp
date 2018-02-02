# Empty Layout

A library to show Empty layouts no the pages where you want show some collection but the collection does not contain any items.

:star:  `build support version used : 26.0.2 `

:star:  `Data Binding is not used`

# Importing Istructions

Add this line in your `module level build.gradle` file

```
  compile 'com.webkul.mobikul:customtoast:1.0.0'
```

# Usage Examples

1) To show over `android.R.id.content` view
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
                        
2) To show over a particular view
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
