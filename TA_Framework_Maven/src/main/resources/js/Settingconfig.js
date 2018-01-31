// conf.js
exports.config = {
 
   framework: 'jasmine',
  //The address of a running selenium server.
  seleniumAddress: 'http://localhost:4444/wd/hub',
  
  //Capabilities to be passed to the webdriver instance.
  capabilities: {
    'browserName': 'chrome'
  },
  
  
  //Specify the name of the specs files.
  specs: ['settingsTab.js'],
  
  //Options to be passed to Jasmine-node.
  jasmineNodeOpts: {
      onComplete: null,
      isVerbose: false,
      showColors: true,
      includeStackTrace: true
	    }
};