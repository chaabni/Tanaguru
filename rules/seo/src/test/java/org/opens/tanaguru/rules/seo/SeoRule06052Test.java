/*
 * @(#)SeoRule06052Test.java
 *
 * Copyright  2010 SAS OPEN-S. All rights reserved.
 * OPEN-S PROPRIETARY/CONFIDENTIAL.  Use is subject to license terms.
 *
 * This file is  protected by the  intellectual  property rights
 * in  France  and  other  countries, any  applicable  copyrights  or
 * patent rights, and international treaty provisions. No part may be
 * reproduced  in  any  form  by  any  mean  without   prior  written
 * authorization of OPEN-S.
 */
package org.opens.tanaguru.rules.seo;

import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rules.seo.test.SeoRuleImplementationTestCase;

/**
 *
 * @author jkowalczyk
 */
public class SeoRule06052Test extends SeoRuleImplementationTestCase {

    public SeoRule06052Test(String testName) {
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName (
                "org.opens.tanaguru.rules.seo.SeoRule06052");
    }

    @Override
    protected void setUpWebResourceMap() {
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-01.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-02.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-03.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-04.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-05.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-06",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-06.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-07",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-07.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-08",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-08.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-09",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-09.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-10",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-10.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-11",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-11.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-1Passed-12",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-1Passed-12.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-2Failed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-2Failed-01.html"));
        getWebResourceMap().put("Seo.Test.6.5.2-4NA-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "SEO/SeoRule06052/Seo.Test.6.5.2-4NA-01.html"));
    }

    @Override
    protected void setProcess() {
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-02").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-03").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-04").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-05").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-06").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-07").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-08").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-09").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-10").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-11").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("Seo.Test.6.5.2-1Passed-12").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("Seo.Test.6.5.2-2Failed-01").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                processPageTest("Seo.Test.6.5.2-4NA-01").getValue());
    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-02").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-03").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-04").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-05").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-06").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-07").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-08").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-09").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-10").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-11").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Seo.Test.6.5.2-1Passed-12").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Seo.Test.6.5.2-2Failed-01").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("Seo.Test.6.5.2-4NA-01").getValue());
    }

}