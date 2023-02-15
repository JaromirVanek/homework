package com.surrus.peopleinspace


import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test


class AppTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test // Click on astronaut name for detailed info, check it is displayed and then click on back arrow
    fun clickOnAstronautDetail() {
        val astronautName = "Frank Rubio"
        composeTestRule
            .onNodeWithText(astronautName)
            .performClick()
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithContentDescription(astronautName)
            .assertIsDisplayed()
        composeTestRule
            .onNodeWithContentDescription("Back")
            .assertIsDisplayed()
            .performClick()
    }


    @Test //Click on ISS position page and check it is displayed
    fun clickISSPosition(){
        composeTestRule
            .onNode(
                hasText("ISS Position")
                and
                        hasClickAction()
            )
            .performClick()
            .assertIsDisplayed()
    }
}