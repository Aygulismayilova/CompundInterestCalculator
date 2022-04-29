<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <title>Compound Interest Calculator</title>
</head>
<body class="bg-blue-700">
<div>
    <div class="bg-white mx-auto text-center w-1/2 py-5 shadow-xl rounded-3xl my-96 max-w-screen-2xl">
        <h2 class="pb mx-6 border-b text-4xl font-semibold">Compound Interest Calculator</h2>
        <h3 class="bg-red-300 text-red-900 font-semibold text-xl w-80 rounded-lg my-2 mx-auto" > ${error}</h3>
        <form action="/" method="post">

            <div class="my-5 mx-8 grid grid-cols-2 gap-4">
                <label for="principalamount" class="flex items-center text-xl">Principal Amount: <span class="text-gray-500 mx-1"></span></label>
                <input class="w-full appearance-none rounded-lg border-2 border-blue-700 p-1 placeholder-blue-800 focus:outline-none focus:ring-2" type="number" id="principalamount" name="principalamount" value="${principle}" />

                <label for="interest" class="flex items-center text-xl">Interest rate (Percentage):</label>
                <input class="w-full appearance-none rounded-lg border-2 border-blue-700 p-1 placeholder-blue-800 focus:outline-none focus:ring-2" type="number" id="interest" min="1" max="100" name="interest" value="${interest}" />

                <label for="years" class="flex items-center text-xl">Number of Years:</label>
                <input class="w-full appearance-none rounded-lg border-2 border-blue-700 p-1 placeholder-blue-800 focus:outline-none focus:ring-2" type="number" id="years" min="1" name="years" value="${years}" />

                <label for="compoundingperiod" class="flex items-center text-xl">Times Per Year:</label>
                <input class="w-full appearance-none rounded-lg border-2 border-blue-700 p-1 placeholder-blue-800 focus:outline-none focus:ring-2" id="compoundingperiod" type="number" min="1" max="12" name="compoundingperiod" value="${compoundingPeriod}" />
            </div>

            <button class="bg-blue-300 text-xl font-semibold px-4 py-1 rounded-lg hover:bg-blue-800 hover:text-white" type="submit">Calculate</button>
            <p class="text-3xl font-mono text-green-600">Result: ${result}</p>
        </form>
    </div>
</div>
</body>
</html>