Related to:
	- GLIPCI-307 (repeated Franca2UML import duplicates UML contents)
	- GLIPCI-417 (Successive import of fidls to EA must work)

Usecase: Export any testcase-version to EA and compare the re-imported result with origin test case. Shall be equally all the time.

E.g.:
	- Export Test.fidl (#0) to EA
	- Import Test.fidl ("#0-import") of EA and compare with origin testcase (#0)
	- Export Test.fidl (#1) to EA
	- Import Test.fidl ("#1-import") of EA and compare with origin testcase (#1)
	etc.

Previous/ outdated data shall be removed each time.