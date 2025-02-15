/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client.pagefactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Used to mark a field on a Page Object to indicate an alternative mechanism for locating the
 * element or a list of elements. Used in conjunction with
 * {@link org.openqa.selenium.support.PageFactory}
 * this allows users to quickly and easily create PageObjects.
 * using iOS UI selectors, accessibility, id, name, class name, tag and xpath
 */
@Retention(RetentionPolicy.RUNTIME) @Target({ElementType.FIELD, ElementType.TYPE})
public @interface iOSFindBy {
    /**
     * It is is iOS UIAutomation string.
     * Read https://developer.apple.com/library/tvos/documentation/DeveloperTools/
     * Conceptual/InstrumentsUserGuide/UIAutomation.html
     */
    String uiAutomator() default "";

    /**
     * It an UI automation accessibility Id which is a convenient to iOS.
     * About iOS accessibility
     * {@link "https://developer.apple.com/library/ios/documentation/UIKit/Reference/
     * UIAccessibilityIdentification_Protocol/index.html"}
     */
    String accessibility() default "";

    /**
     * It is an id of the target element.
     */
    String id() default "";

    /**
     * It is a name of a type/class of the target element.
     */
    String className() default "";

    /**
     * It is a desired element tag.
     */
    String tagName() default "";

    /**
     * It is a xpath to the target element.
     */
    String xpath() default "";

    /**
     * This parameter makes perform the searching by iOS NSPredicate.
     * This locator strategy is available in XCUITest Driver mode.
     * Documentation to read:
     * https://github.com/appium/java-client/blob/master/docs/
     * Installing-xcuitest-driver.md
     *
     * https://github.com/appium/appium-xcuitest-driver/blob/master/README.md
     */
    String nsPredicate()  default "";
}
