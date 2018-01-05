package com.mobikul.emptylayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vedesh.kumar on 24/1/17. @Webkul Software Pvt. Ltd
 */

public class EmptyFragment extends Fragment {

    /* Main layout background color*/
    private int mBackgroundColor;

    /* Image which will be showed in the middle*/
    private int mImageDrawableId;
    private int mImageDrawableWidth = (HelperFuntions.getScreenWidth() / 2);
    private int mImageDrawableHeight;

    /* Main title of the layout */
    private String mTitleText;
    private float mTitleTextSize;
    private int mTitleTextColor;

    /* Some content which will be displayed below the title */
    private String mContentText;
    private float mContentTextSize;
    private int mContentTextColor;

    /* Button below the content */
    private String mButtonText;
    private int mButtonBackgroundColor;
    private float mButtonTextSize;
    private int mButtonTextColor;
    private View.OnClickListener mButtonClickListener;


    private View mEmptyFragmentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mEmptyFragmentView = inflater.inflate(R.layout.fragment_empty, container, false);
        return mEmptyFragmentView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        createEmptyFragment();
    }

    private void createEmptyFragment() {
        try {

            // Background

            if (mBackgroundColor != 0) {
                mEmptyFragmentView.findViewById(R.id.layout).setBackgroundColor(mBackgroundColor);
            }


            // Image

            if (mImageDrawableId != 0) {
                ((ImageView) mEmptyFragmentView.findViewById(R.id.image)).setImageDrawable(ContextCompat.getDrawable(getContext(), mImageDrawableId));
            }

            ViewGroup.LayoutParams layoutParams = mEmptyFragmentView.findViewById(R.id.image).getLayoutParams();
            layoutParams.width = mImageDrawableWidth;
            if (mImageDrawableHeight != 0) {
                layoutParams.height = mImageDrawableHeight;
            }
            mEmptyFragmentView.findViewById(R.id.image).setLayoutParams(layoutParams);


            //Title

            if (mTitleText != null && !mTitleText.trim().isEmpty()) {
                ((TextView) mEmptyFragmentView.findViewById(R.id.title)).setText(mTitleText);
            }

            if (mTitleTextSize != 0) {
                ((TextView) mEmptyFragmentView.findViewById(R.id.title)).setTextSize(mTitleTextSize);
            }

            if (mTitleTextColor != 0) {
                ((TextView) mEmptyFragmentView.findViewById(R.id.title)).setTextColor(mTitleTextColor);
            }


            // Content

            if (mContentText != null && !mContentText.trim().isEmpty()) {
                ((TextView) mEmptyFragmentView.findViewById(R.id.content)).setVisibility(View.VISIBLE);
                ((TextView) mEmptyFragmentView.findViewById(R.id.content)).setText(mContentText);
            }

            if (mContentTextSize != 0) {
                ((TextView) mEmptyFragmentView.findViewById(R.id.content)).setTextSize(mContentTextSize);
            }

            if (mContentTextColor != 0) {
                ((TextView) mEmptyFragmentView.findViewById(R.id.content)).setTextColor(mContentTextColor);
            }


            // Button

            if (mButtonText != null && !mButtonText.trim().isEmpty()) {
                ((Button) mEmptyFragmentView.findViewById(R.id.button)).setVisibility(View.VISIBLE);
                ((Button) mEmptyFragmentView.findViewById(R.id.button)).setText(mButtonText);
            }

            if (mButtonBackgroundColor != 0) {
                ((Button) mEmptyFragmentView.findViewById(R.id.button)).setBackgroundColor(mButtonBackgroundColor);
            }

            if (mButtonTextSize != 0) {
                ((Button) mEmptyFragmentView.findViewById(R.id.button)).setTextSize(mButtonTextSize);
            }

            if (mButtonTextColor != 0) {
                ((Button) mEmptyFragmentView.findViewById(R.id.button)).setTextColor(mButtonTextColor);
            }

            if (mButtonClickListener != null) {
                ((Button) mEmptyFragmentView.findViewById(R.id.button)).setOnClickListener(mButtonClickListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        TO SHOW THE FRAGMENT
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public EmptyFragment show(Activity activity) {
        FragmentTransaction fragmentTransaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(android.R.id.content, this, EmptyFragment.class.getSimpleName());
        fragmentTransaction.addToBackStack(EmptyFragment.class.getSimpleName());
        fragmentTransaction.commit();
        return this;
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        TO GET A PARTICULAR VIEW
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public View getAttachedView(ViewType viewType) {
        switch (viewType) {
            case LAYOUT:
                return mEmptyFragmentView.findViewById(R.id.layout);
            case IMAGE:
                return mEmptyFragmentView.findViewById(R.id.image);
            case TITLE:
                return mEmptyFragmentView.findViewById(R.id.title);
            case CONTENT:
                return mEmptyFragmentView.findViewById(R.id.content);
            case BUTTON:
                return mEmptyFragmentView.findViewById(R.id.button);
        }
        return null;
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        BACKGROUND
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public EmptyFragment setBackgroundColor(int backgroundColor) {
        mBackgroundColor = backgroundColor;
        return this;
    }


    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        IMAGE
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public EmptyFragment setImageDrawableId(int imageDrawableId) {
        mImageDrawableId = imageDrawableId;
        return this;
    }

    public EmptyFragment setmImageDrawableWidth(int imageDrawableWidth) {
        mImageDrawableWidth = imageDrawableWidth;
        return this;
    }

    public EmptyFragment setImageDrawableHeight(int imageDrawableHeight) {
        mImageDrawableHeight = imageDrawableHeight;
        return this;
    }


    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        TITLE
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public EmptyFragment setTitleText(String titleText) {
        mTitleText = titleText;
        return this;
    }

    public EmptyFragment setTitleTextSize(float titleTextSize) {
        mTitleTextSize = titleTextSize;
        return this;
    }

    public EmptyFragment setTitleTextColor(int titleTextColor) {
        mTitleTextColor = titleTextColor;
        return this;
    }


    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        CONTENT
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public EmptyFragment setContentText(String contentText) {
        mContentText = contentText;
        return this;
    }

    public EmptyFragment setContentTextSize(float contentTextSize) {
        mContentTextSize = contentTextSize;
        return this;
    }

    public EmptyFragment setContentTextColor(int contentTextColor) {
        mContentTextColor = contentTextColor;
        return this;
    }


    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------
        BUTTON
     ------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public EmptyFragment setButtonText(String buttonText) {
        mButtonText = buttonText;
        return this;
    }

    public EmptyFragment setButtonBackgroundColor(int buttonBackgroundColor) {
        mButtonBackgroundColor = buttonBackgroundColor;
        return this;
    }

    public EmptyFragment setButtonTextSize(float buttonTextSize) {
        mButtonTextSize = buttonTextSize;
        return this;
    }

    public EmptyFragment setButtonTextColor(int buttonTextColor) {
        mButtonTextColor = buttonTextColor;
        return this;
    }

    public EmptyFragment setButtonOnClickListener(View.OnClickListener buttonClickListener) {
        mButtonClickListener = buttonClickListener;
        return this;
    }
}