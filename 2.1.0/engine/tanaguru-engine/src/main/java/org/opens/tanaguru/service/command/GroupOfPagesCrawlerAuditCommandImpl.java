/*
 *  Tanaguru - Automated webpage assessment
 *  Copyright (C) 2008-2011  Open-S Company
 * 
 *  This file is part of Tanaguru.
 * 
 *  Tanaguru is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Contact us by mail: open-s AT open-s DOT com
 */

package org.opens.tanaguru.service.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.opens.tanaguru.contentadapter.AdaptationListener;
import org.opens.tanaguru.entity.parameterization.Parameter;
import org.opens.tanaguru.entity.service.audit.AuditDataService;
import org.opens.tanaguru.entity.service.audit.ContentDataService;
import org.opens.tanaguru.entity.service.audit.ProcessResultDataService;
import org.opens.tanaguru.entity.service.parameterization.ParameterDataService;
import org.opens.tanaguru.entity.service.reference.TestDataService;
import org.opens.tanaguru.entity.service.subject.WebResourceDataService;
import org.opens.tanaguru.service.*;
import org.opens.tanaguru.util.FileNaming;

/**
 *
 * @author jkowalczyk
 */
public class GroupOfPagesCrawlerAuditCommandImpl extends CrawlAuditCommandImpl {
    
    /**
     * The URL that identifies the list of pages to test
     */
    private String siteUrl;
    
    /**
     * The list of URLs to test
     */
    private List<String> pageUrlList = new ArrayList<String>();
    
    public GroupOfPagesCrawlerAuditCommandImpl(
            String siteUrl, 
            List<String> pageUrlList,
            Set<Parameter> paramSet,
            AuditDataService auditDataService, 
            TestDataService testDataService, 
            ParameterDataService parameterDataService,
            WebResourceDataService webResourceDataService,
            ContentDataService contentDataService, 
            ProcessResultDataService processResultDataService, 
            CrawlerService crawlerService,
            ContentAdapterService contentAdapterService, 
            ProcessorService processorService, 
            ConsolidatorService consolidatorService, 
            AnalyserService analyserService, 
            AdaptationListener adaptationListener,
            int adaptationTreatmentWindow,
            int processingTreatmentWindow,
            int consolidationTreatmentWindow,
            int analysisTreatmentWindow) {
        super(paramSet, 
              auditDataService, 
              testDataService, 
              parameterDataService, 
              webResourceDataService, 
              contentDataService, 
              processResultDataService, 
              crawlerService, 
              contentAdapterService, 
              processorService, 
              consolidatorService, 
              analyserService, 
              adaptationListener,
              adaptationTreatmentWindow,
              processingTreatmentWindow,
              consolidationTreatmentWindow,
              analysisTreatmentWindow);
        this.siteUrl = siteUrl;
        for (String url : pageUrlList) {
            this.pageUrlList.add(FileNaming.addProtocolToUrl(url));
        }
    }
    
    @Override
    public void callCrawlerService() {
        getCrawlerService().crawlGroupOfPages(getAudit(), siteUrl, pageUrlList);
    }

}