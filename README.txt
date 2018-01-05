new EmptyFragment()
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
