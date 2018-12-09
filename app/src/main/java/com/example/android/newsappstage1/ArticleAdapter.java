/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each Article
 * in the data source (a list of {@link Article} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context of the app
     * @param allArticle is the list of allArticle, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> allArticle) {
        super(context, 0, allArticle);
    }

    /**
     * Returns a list item view that displays information about the Article at the given position
     * in the list of allArticle.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the Article at the given position in the list of allArticle
        Article currentArticle = getItem(position);

        // Find the TextView with view ID sectionId
        TextView sectionView = (TextView) listItemView.findViewById(R.id.news_section);
        // Display the general context of the current Article in that TextView
        sectionView.setText( currentArticle.getmArticleSection());

        // Find the TextView with view ID news_title
        TextView titleView = (TextView) listItemView.findViewById( R.id.news_title );
        // Display the title of the current Article in that TextView
        titleView.setText( currentArticle.getmArticleTitle() );

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById( R.id.date );
        // Display the date of the current Article in that TextView
        dateView.setText( currentArticle.getmDate() );

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById( R.id.time );
        // Display the time of the current Article in that TextView
        timeView.setText( currentArticle.getmTime() );

        // Find the TextVIew with view ID author_text_view
        TextView authorTV = (TextView) listItemView.findViewById( R.id.author_text_view );
        authorTV.setText( R.string.author_text_view );

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById( R.id.author );
        // Display the author of the current Article in that TextView
        authorView.setText( currentArticle.getmAuthors() );

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}
