package org.wikipedia.lessons03.homework

import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.R
import org.wikipedia.views.AppTextView

val skipButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_skip_button,
    R.string.onboarding_skip
)

val zeroPageLanguageOptionLabel = listOf(
    AppTextView::class.java,
    R.id.option_label,
    null
)

val continueButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_done_button,
    R.string.onboarding_get_started
)

val pageIndicator = listOf(
    TabLayout::class.java,
    R.id.view_onboarding_page_indicator,
    null
)

val addLanguagesButton = listOf(
    MaterialButton::class.java,
    R.id.addLanguageButton,
    R.string.onboarding_multilingual_add_language_text
)

val primaryText = listOf(
    AppTextView::class.java,
    R.id.primaryTextView,
    R.string.onboarding_welcome_title_v2
)

val zeroPageSecondaryText = listOf(
    AppTextView::class.java,
    R.id.secondaryTextView,
    R.string.onboarding_multilingual_secondary_text
)

val zeroPageImageViewCentered = listOf(
    AppCompatImageView::class.java,
    R.id.imageViewCentered,
    R.drawable.w_nav_mark
)

val zeroPageLanguageList = listOf(
    RecyclerView::class.java,
    R.id.languageList,
    null
)





