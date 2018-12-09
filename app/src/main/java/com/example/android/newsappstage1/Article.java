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

/**
 * An {@link Article} object contains information related to a single Article.
 */
public class Article {

    /** General context of the Article */
    private String mArticleSection;

    /** Title of the Article */
    private String mArticleTitle;

    /** Website URL of the Article on The Guardian */
    private String mUrl;

    /** Raw Date of the Article */
    private String mRawDate;

    /** Date of the Article */
    private String mDate;

    /** Time of the Article */
    private String mTime;

    /** Author of the Article */
    private String mAuthors;


    /**
     * Constructs a new {@link Article} object.
     *
     * @param newsSection is the general context of the Article
     * @param newsTitle is the title of the current Article
     * @param newsWeblink is the hyper link to access to the current Article online
     */
    public Article(String newsSection, String newsTitle, String newsWeblink, String date, String authors) {
        mArticleSection = newsSection;
        mArticleTitle = newsTitle;
        mUrl = newsWeblink;
        mRawDate = date;
        mAuthors = authors;
    }


    /**
     * Returns the sectionId (general context)
     * of the current Article
     */
    public String getmArticleSection() {
        return mArticleSection;
    }

    /**
     * Returns the title of the current Article
     */
    public String getmArticleTitle() {
        return mArticleTitle;
    }

    /**
     * Returns the weblink of the current Article
     */
    public String getmUrl() {
        return mUrl;
    }

    /**
     * Returns the date of the current Article published
     */
    public String getmDate() {

        mDate = mRawDate.substring(0,10);
        return mDate;
    }

    /**
     * Returns the time of the current Article published
     */
    public String getmTime(){
        mTime = mRawDate.substring(11,19);
        return mTime;
    }

    /**
     * Returns the author of the current Article
     */
    public String getmAuthors() {
        return mAuthors;
    }



}
