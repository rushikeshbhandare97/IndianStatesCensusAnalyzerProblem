public class  CensusAnalyzerTest{

@Test
    public void givenIndianStateCodeFile_ShouldReturn_CorrectRecords() {
        try {
    /*Test Cases For Reading IndiaStateCode.csv*/
    @Test
    public void givenIndianStateCodeFile_ShouldReturn_CorrectRecords() {
        try {
    /*Test Cases For Reading IndiaStateCode.csv*/
    @Test
    public void givenIndianStateCodeFile_ShouldReturn_CorrectRecords() {
        try {
    /*Test Cases For Reading IndiaStateCode.csv*/
    @Test
    public void givenIndianStateCodeFile_ShouldReturn_CorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadStateCode(STATE_CODE_CSV_FILE_PATH);
            assertEquals(37, numOfRecords);
            System.out.println("Pass 6");
        } catch (CensusAnalyserException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenIndiaStateCode_WithWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenIndiaStateCode_WithWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenIndiaStateCode_WithWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenIndiaStateCode_WithWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadStateCode(WRONG_CSV_FILE_PATH);
        } catch (CensusAnalyserException e) {
            System.out.println(e.getMessage());
            System.out.println("Pass 7");
            assertEquals(CensusAnalyserException.ExceptionType.STATE_CODE_FILE_PROBLEM, e.type);
        }
    }
    @Test
    public void givenIndiaStateCodeFile_WithWrongFileType_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenIndiaStateCodeFile_WithWrongFileType_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenIndiaStateCodeFile_WithWrongFileType_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void givenIndiaStateCodeFile_WithWrongFileType_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadStateCode(WRONG_FILE_TYPE);
        } catch (CensusAnalyserException e) {
            System.out.println(e.getMessage());
            System.out.println("Pass 8");
            assertEquals(CensusAnalyserException.ExceptionType.STATE_CODE_FILE_PROBLEM, e.type);
        }
    }
    @Test
    public void givenIndiaStateCodeCSVFile_WithIncorrectDelimiter_ShouldThrowException() {
        try {
    @Test
    public void givenIndiaStateCodeCSVFile_WithIncorrectDelimiter_ShouldThrowException() {
        try {
    @Test
    public void givenIndiaStateCodeCSVFile_WithIncorrectDelimiter_ShouldThrowException() {
        try {
    @Test
    public void givenIndiaStateCodeCSVFile_WithIncorrectDelimiter_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadStateCode(STATE_CODE_CSV_FILE_PATH);
            censusAnalyser.loadStateCode(WRONG_DELIMITER_STATE_CSV_FILE_PATH);
        } catch (CensusAnalyserException e) {
            System.out.println(e.getMessage());
            System.out.println("Pass 9");
            assertEquals(CensusAnalyserException.ExceptionType.RUN_TIME_EXCEPTION, e.type);
        }
    }
    @Test
    public void givenIndianStateCodeCSVFile_WithWrongHeader_ShouldThrowException() {
        try {
    @Test
    public void givenIndianStateCodeCSVFile_WithWrongHeader_ShouldThrowException() {
        try {
    @Test
    public void givenIndianStateCodeCSVFile_WithWrongHeader_ShouldThrowException() {
        try {
    @Test
    public void givenIndianStateCodeCSVFile_WithWrongHeader_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadStateCode(STATE_CODE_CSV_FILE_PATH);
            censusAnalyser.loadStateCode(WRONG_HEADER_STATE_CSV_FILE_PATH);
        } catch (CensusAnalyserException e) {
            System.out.println(e.getMessage());
            System.out.println("Pass 10");
            assertEquals("Error capturing CSV header!", e.getMessage());
        }
    }
