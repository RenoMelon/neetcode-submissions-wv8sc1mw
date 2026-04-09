SELECT t.student_id, t.exam_id, t.score
FROM (
    SELECT *, ROW_NUMBER() OVER(
        PARTITION BY student_id
        ORDER BY score DESC, exam_id ASC
    ) as rn
    FROM exam_results
) t
WHERE rn = 1;