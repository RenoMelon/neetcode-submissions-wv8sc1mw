SELECT e.left_operand, e.operator, e.right_operand,
CASE
    WHEN e.operator = '>' THEN (v1.value > v2.value)
    WHEN e.operator = '<' THEN (v1.value < v2.value)
    WHEN e.operator = '=' THEN (v1.value = v2.value)
END AS value
FROM expressions e
JOIN variables v1 ON e.left_operand = v1.name
JOIN variables v2 ON e.right_operand = v2.name;
    
