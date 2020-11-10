-- Student Progress Script
-- Created by Roman Jazmin

SET ANSI_NULLS ON

SELECT PercentLeftBeforeCompletion = (5 - (COUNT(Chapter1CompleteDate) + COUNT(Chapter2CompleteDate) + COUNT(Chapter3CompleteDate) + COUNT(Chapter4CompleteDate) + COUNT(Chapter5CompleteDate)))*(.1)
FROM [dbo].[StudentProgressTable]
where StudentID = 1