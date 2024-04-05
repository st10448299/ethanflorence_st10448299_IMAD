package com.example.assignment1


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyUnitTest {

    @Rule
    @JvmField
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testSearchButton() {
        // Type an age into the EditText and perform a button click
        onView(withId(R.id.etA)).perform(typeText("96"))
        onView(withId(R.id.btnsearch)).perform(click())

        // Check if the information is displayed in the TextView
        onView(withId(R.id.infoDisplay)).check(matches(withText("Queen elizabeth, Elizabeth II (Elizabeth Alexandra Mary; 21 April 1926 – 8 September 2022) was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022. She was queen regnant of 32 sovereign states over the course of her lifetime and remained the monarch of 15 realms by the time of her death. Her reign of over 70 years is the longest of any British monarch, the longest of any female monarch, and the second longest verified reign of any monarch of a sovereign state in history.")))
    }
}
